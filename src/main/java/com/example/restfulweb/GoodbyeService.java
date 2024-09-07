package com.example.restfulweb;

import org.springframework.stereotype.Component;

@Component
public class GoodbyeService {

		public String goodbye() {
			
			return "Goodbye That is all folks, See you next time!";
		}
}
