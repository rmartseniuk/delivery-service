package com.epam.martseniuk.client;

import com.epam.martseniuk.resource.AccountResource;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author Roman_Martseniuk
 */
@FeignClient(url = "localhost:8082", name = "user-service")
public interface AccountResourceClient extends AccountResource {
}
