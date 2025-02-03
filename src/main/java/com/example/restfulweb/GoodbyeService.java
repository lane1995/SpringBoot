package com.example.restfulweb;

import org.springframework.stereotype.Component;

@Component
public class GoodbyeService {

		public String goodbye() {
			
			return "That is all folks";
		}
}
