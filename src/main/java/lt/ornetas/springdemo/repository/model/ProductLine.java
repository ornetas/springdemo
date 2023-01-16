package lt.ornetas.springdemo.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "productlines")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProductLine {

    @Id
    @Column (name = "productline")
    private String productLine;
    @Column (name = "textdescription")
    private String textDescription;
    @Column (name = "htmldesription")
    private String htmlDescription;


//    @Override
//    public String toString() {
//        return "{" +
//                ", Product line: " + productLine + '\'' +
//                ", description:'" + textDescription + '\'' +
//                ", html description: '" + htmlDescription + '\'' +
//                '}';
//    }
}
