package au.com.nab.icommerce.api.gateway.config;

import au.com.nab.icommerce.common.grpc.BaseGrpcServicesConfiguration;
import au.com.nab.icommerce.product.api.ProductCommandServiceGrpc;
import au.com.nab.icommerce.product.api.ProductQueryServiceGrpc;
import com.netflix.appinfo.InstanceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class GrpcServicesConfig extends BaseGrpcServicesConfiguration {

    @Bean
    public ProductCommandServiceGrpc.ProductCommandServiceBlockingStub productCommandServiceBlockingStub() {
        InstanceInfo instanceInfo = getGrpcInstanceInfo("product-command-service");
        return ProductCommandServiceGrpc.newBlockingStub(newChannel(instanceInfo.getHostName(), instanceInfo.getPort()));
    }

    @Bean
    public ProductQueryServiceGrpc.ProductQueryServiceBlockingStub productQueryServiceBlockingStub() {
        InstanceInfo instanceInfo = getGrpcInstanceInfo("product-query-service");
        return ProductQueryServiceGrpc.newBlockingStub(newChannel(instanceInfo.getHostName(), instanceInfo.getPort()));
    }

}