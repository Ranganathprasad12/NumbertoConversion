package com.NumbertoWords.Conversion.Controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.NumbertoWords.Conversion.Clientt.SoapClientt;
import com.NumbertoWords.Conversion.consumer.NumberToWords;
import com.NumbertoWords.Conversion.consumer.NumberToWordsResponse;

@RestController
public class ConversionController {
	
	@Autowired
	private  SoapClientt client;


	@GetMapping("/number-to-words/{number}")
    public String convertNumberToWords(@PathVariable int number) {
        NumberToWords request = new NumberToWords();
        BigInteger numberAsBigInteger = BigInteger.valueOf(number);
        request.setUbiNum(numberAsBigInteger);

        NumberToWordsResponse response = client.getwords(request);

        return response.getNumberToWordsResult();
    }
}
