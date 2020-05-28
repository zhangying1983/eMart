package com.ibm.trainning.emart.service;

import org.springframework.cloud.openfeign.FeignClient;

import com.ibm.trainning.emart.service.vo.User;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@FeignClient("user")
public interface UserServiceRemote {
	//@GetMapping(value = "/user/{username}", headers=)
	//@RequestMapping(value = "/user/{username}", method = RequestMethod.GET, headers = {"Authorization: Basic YWRtaW46MTIz"})
	@RequestLine("GET api/user/{username}")
	// admin : 123
	@Headers("Authorization:Basic YWRtaW46MTIz")
	public User getUserInfo(@Param("username") String username);

}
