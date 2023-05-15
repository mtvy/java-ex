package builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("Enterprice");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(12000);
    }
}
