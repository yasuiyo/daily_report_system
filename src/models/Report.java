package models;

@Table(name= "reports")
@NamedQueries({
	`NamedQuery(
			name = "getAllreports",
			query = "SELECT r FROM Report AS r ORDER BY r.id DESC"
			),
	 @NamedQuery(
			 name = "getReportCount",
			 query = "SELECT COUNT(r) FROM Report AS r"
			 ),
})


@Entity
public class Report {
   @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
}
