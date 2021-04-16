package au.com.nab.icommerce.product;

import au.com.nab.icommerce.product.api.ProductServiceGrpc;
import au.com.nab.icommerce.product.protobuf.PProduct;
import au.com.nab.icommerce.product.service.ProductService;
import com.google.protobuf.Int32Value;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class ProductServiceGrpcServer extends ProductServiceGrpc.ProductServiceImplBase {

    @Autowired
    private ProductService customerService;

    @Override
    public void createProduct(PProduct request, StreamObserver<Int32Value> responseObserver) {
        Int32Value result = customerService.createProduct(request);
        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }

    @Override
    public void updateProduct(PProduct request, StreamObserver<Int32Value> responseObserver) {
        Int32Value result = customerService.updateProduct(request);
        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }

}
