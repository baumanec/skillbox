import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "PurchaseList")
public class PurchaseList {

    @Id
    @EmbeddedId
    @Getter
    @Setter
    private PurchaseListPK id;

    @Getter
    @Setter
    @Column(name = "student_name", insertable = false, updatable = false)
    private String studentName;

    @Getter
    @Setter
    @Column(name = "course_name", insertable = false, updatable = false)
    private String courseName;

    @Getter
    @Setter
    private int price;

    @Getter
    @Setter
    @Column(name = "subscription_date")
    private Date subscriptionDate;

}
