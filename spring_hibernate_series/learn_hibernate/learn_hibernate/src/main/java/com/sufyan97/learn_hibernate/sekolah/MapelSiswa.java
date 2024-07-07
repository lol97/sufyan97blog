package com.sufyan97.learn_hibernate.sekolah;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class MapelSiswa {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "NOMOR_INDUK")
    private Siswa siswa;

    @ManyToOne
    @JoinColumn(name = "KODE_MAPEL")
    private Mapel mapel;

    private Integer nilai;
}
