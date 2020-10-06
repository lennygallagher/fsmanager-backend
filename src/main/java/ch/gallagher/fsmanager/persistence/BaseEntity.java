package ch.gallagher.fsmanager.persistence;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public abstract class BaseEntity {

    public BaseEntity() {
        this.id = UUID.randomUUID().toString();
    }

    @Id
    private String id;
}
