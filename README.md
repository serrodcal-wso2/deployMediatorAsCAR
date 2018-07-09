# deployMediatorAsCAR

```bash
git clone https://github.com/serrodcal/deployMediatorAsCAR.git
cd deployMediatorAsCAR/
mvn clean install
docker pull serrodcal/wso2esb5:0.1.0
docker run -d --name phoenix -p 8280:8280 -p 8243:8243 -p 9763:9763 -p 9443:9443 -p 19444:19444 serrodcal/wso2esb5:0.1.0
```