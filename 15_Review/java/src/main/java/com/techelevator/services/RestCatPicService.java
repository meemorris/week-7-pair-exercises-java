package com.techelevator.services;

import org.springframework.stereotype.Component;

import com.techelevator.model.CatPic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RestCatPicService implements CatPicService {

	private static final String API_URL = "https://random-cat-api.netlify.app/.netlify/functions/api";
	private RestTemplate restTemplate = new RestTemplate();

	@Override
	public CatPic getPic() {
		return restTemplate.getForObject(API_URL, CatPic.class);
	}


}	
