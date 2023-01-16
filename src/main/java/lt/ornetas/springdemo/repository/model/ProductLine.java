package lt.ornetas.springdemo.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "productlines")
public class ProductLine {

    @Id
    @Column (name = "productline")
    private String productLine;
    @Column (name = "textdescription")
    private String textDescription;
    @Column (name = "htmldesription")
    private String htmlDescription;

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription;
    }

    @Override
    public String toString() {
        return "{" +
                ", Product line: " + productLine + '\'' +
                ", description:'" + textDescription + '\'' +
                ", html description: '" + htmlDescription + '\'' +
                '}';
    }
}
