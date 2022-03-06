package com.es;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.nio.entity.NStringEntity;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Request;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import scala.collection.mutable.ArrayBuffer;

/**
 * @Author wangjia
 * @Date 2022/2/21
 */
public class EsRestApi {



    RestClient restClient = RestClient.builder(
            new HttpHost("localhost", 9200, "http")).build();






    /**
     * 查看api信息
     *
     * @throws Exception
     */
    public void bookApi() throws Exception {
        String method = "GET";
        String endpoint = "/book";
        Response response = restClient.performRequest(method, endpoint);
        System.out.println(EntityUtils.toString(response.getEntity()));
    }


    public void bulk() throws UnsupportedEncodingException {
//        HttpEntity = new NStringEntity(bulkRequest, ContentType.APPLICATION_JSON)
        HttpEntity entity = new NStringEntity("","application/json");

        Request request = new Request("POST", "bulkRequest");
        request.setEntity(entity);
//        Response response = restClient.performRequest("POST", "_bulk", new HashMap[String, String](), entity, new ArrayBuffer[Header](): _*)

    }




}
