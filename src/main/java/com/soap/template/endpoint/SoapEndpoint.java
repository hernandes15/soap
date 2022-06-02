package com.soap.template.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.soap.template.RequestSoap;
import com.soap.template.ResponseSoap;

@Endpoint
public class SoapEndpoint {
	public static final String NAMESPACE_URI = "http://www.soap.com/soap";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "requestSoap")
	@ResponsePayload
	ResponseSoap response(@RequestPayload RequestSoap request) throws JsonProcessingException {
		ResponseSoap response = new ResponseSoap();
		response.setCode("S001");
		response.setStatus("Berhasil");
		return response;
	}

}
