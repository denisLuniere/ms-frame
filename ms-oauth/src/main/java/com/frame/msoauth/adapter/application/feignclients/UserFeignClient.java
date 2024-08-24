package com.frame.msoauth.adapter.application.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.frame.msoauth.model.entities.User;



@Component
@FeignClient(name = "ms-user", path = "/users")
public interface UserFeignClient {

	@GetMapping(value = "/search")
	ResponseEntity<User> findByEmail(@RequestParam String email);	
}
