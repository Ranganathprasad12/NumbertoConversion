package com.NumbertoWords.Conversion.Clientt;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.NumbertoWords.Conversion.consumer.NumberToWords;
import com.NumbertoWords.Conversion.consumer.NumberToWordsResponse;

@Service
public class SoapClientt {
	
	
	@Autowired
    private Jaxb2Marshaller marshaller;

	
	
	private WebServiceTemplate template;

	public NumberToWordsResponse getwords(NumberToWords request) {
		template = new WebServiceTemplate(marshaller);
		NumberToWordsResponse words = (NumberToWordsResponse) template.marshalSendAndReceive("https://www.dataaccess.com/webservicesserver/NumberConversion.wso?WSDL",
				request);
		return words;
	}
	 
}
