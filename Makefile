all:
	make -C ./grpc-cache-proto publish
	make -C ./grpc-cache-server all
	make -C ./grpc-cache-client all
