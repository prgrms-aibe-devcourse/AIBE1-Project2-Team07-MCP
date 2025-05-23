package org.lucky0111.pettalkmcpserver.repository.trainer;

import org.lucky0111.pettalkmcpserver.domain.entity.trainer.TrainerTagRelation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface TrainerTagRepository extends JpaRepository<TrainerTagRelation, Long> {
    List<TrainerTagRelation> findByTrainer_TrainerId(UUID trainerId);

    List<TrainerTagRelation> findAllByTrainer_TrainerIdIn(Collection<UUID> trainerIds);
}
