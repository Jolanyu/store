package vip.lj.store.pojo.entity.common;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class BaseEntity implements Serializable {
    private String createdUser;
    private LocalDateTime createdTime;
    private String modifiedUser;
    private LocalDateTime modifiedTime;
}
