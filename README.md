# ZLBS-lbs
A load-balancing server which is used to build an IM system
# 使用步骤
### 1.配置地址:
  lbs.servers配置服务器ip和端口，中间用英文逗号分割
  eg:
    lbs.servers:192.168.49.129:8081,192.168.49.130.8081
### 2.配置策略:
  lbs.policy配置负载均衡策略
    目前支持：
     random：随机
     round-routing：轮询
