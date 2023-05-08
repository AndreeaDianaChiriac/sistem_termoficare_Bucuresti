package entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "adresa")
public class Adresa {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "sector", nullable = false)
    private int sector;

    @Column(name = "strada", nullable = false)
    private String strada;

    @Column(name = "bloc", nullable = false)
    private String bloc;

    @Column(name = "scara")         //it may be nullable due to inconsistency of data
    private String scara;

    @ManyToOne
    @JoinColumn(name = "agent_termic_afectat_id")
    private int agentTermicAfectatId;

    @Column(name = "data_rezolvare")
    Date dataRezolvare;

}
