package ch.gallagher.fsmanager.persistence;

import lombok.*;

import javax.persistence.Entity;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Airport extends BaseEntity {
    private String name;
    private String iata;
    private String icao;
}
