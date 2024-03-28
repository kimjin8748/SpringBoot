package inhatc.cse.springboot.testproject.controller;

import inhatc.cse.springboot.testproject.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/vi/get-api")
public class GetController {

    //http://localhost:8080/api/vi/get-api/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello(){
        return "Hello World!";
    }

    //http://localhost:8080/api/vi/get-api/name
    @GetMapping(value = "/name")
    public String getName(){
        return "yongjin";
    }

    //http://localhost:8080/api/vi/get-api/variable1/{String 값}
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }

    //http://localhost:8080/api/vi/get-api/variable2/{String 값}
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var){
        return var;
    }

    //http://localhost:8080/api/vi/get-api/request1?name=yongjin&email=kimjin8748@gmail.com&organization=kimjin8748
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return  name + " " + email + " " + organization;
    }

    //http://localhost:8080/api/vi/get-api/request2?key1=value1&key2=value2
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        /*
        param.forEach((key, value) -> sb.append(key).append(" : ").append(value).append("\n"));
        */

        return sb.toString();
    }

    //http://localhost:8080/api/vi/get-api/request3?name=yongjin&email=kimjin8748@gmail.com&organization=kimjin8748
    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDTO memberDTO) {
        //return memeberDTO.getName() + " " + memberDTO.getEmail() + " " + "memberDTO.getOrganization();
        return memberDTO.toString();
    }

}
