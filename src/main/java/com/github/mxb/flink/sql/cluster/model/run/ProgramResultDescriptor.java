package com.github.mxb.flink.sql.cluster.model.run;

import lombok.Builder;
import lombok.Data;
import org.apache.flink.types.Row;

import java.util.List;

/**
 * program job result
 *
 * @author moxianbin
 * @since 2020/4/17 14:26
 */
@Builder
@Data
public class ProgramResultDescriptor {

    private String jobId;

    private String ip;

    private int port;

    private boolean isMaterialized;

    private List<Row> resultRows;

}
