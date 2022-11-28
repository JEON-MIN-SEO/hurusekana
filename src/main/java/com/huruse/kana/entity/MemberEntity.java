package com.huruse.kana.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="test_table")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer num;

    private Integer detect_id;

    private java.sql.Time _date;

    private String statu;

    public MemberEntity(Integer num, Integer detect_id, java.sql.Time _date, String statu) {
        this.num = num;
        this.detect_id = detect_id;
        this._date = _date;
        this.statu = statu;
    }
}
