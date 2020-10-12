package ch.gallagher.fsmanager.persistence;

import lombok.Getter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.util.UUID;

@Getter
@MappedSuperclass
public abstract class BaseEntity {

    public BaseEntity() {
        this.id = UUID.randomUUID().toString();
    }

    @Id
    private String id;

    @Version
    private Long version;
}
