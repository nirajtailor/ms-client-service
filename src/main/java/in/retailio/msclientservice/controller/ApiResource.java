package in.retailio.msclientservice.controller;

//import org.apache.http.HttpHeaders;
import in.retailio.msclientservice.config.ConfigData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
//@RefreshScope
@RequestMapping("/client")
public class ApiResource {

    @Autowired
    private ConfigData configData;

    @RequestMapping("/config")
    public List<String> getConfig(){
        return Arrays.asList(configData.getConfigA(), configData.getConfigB());
    }

    @RequestMapping("/name")
    public String getName(){
        return configData.getName();
    }
}
