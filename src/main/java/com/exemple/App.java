package com.exemple;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person("Maxime","Martinez");

        System.out.println(convertToJson(person));
        System.out.println(capitalizeString("capitalized"));

    }
    public static String convertToJson(Person person) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String capitalizeString(String str) {
        return StringUtils.capitalize(str);
    }

}
