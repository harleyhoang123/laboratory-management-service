package vn.edu.fpt.laboratory.dto.response.laboratory;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import lombok.experimental.SuperBuilder;
import vn.edu.fpt.laboratory.dto.common.AuditableResponse;
import vn.edu.fpt.laboratory.dto.common.MemberInfoResponse;
import vn.edu.fpt.laboratory.dto.response.project.GetProjectResponse;

import java.util.List;

/**
 * @author : Hoang Lam
 * @product : Charity Management System
 * @project : Charity System
 * @created : 29/11/2022 - 22:27
 * @contact : 0834481768 - hoang.harley.work@gmail.com
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
@JsonPropertyOrder({"laboratoryId", "laboratoryName", "description", "members", "projects", "major", "ownerBy"})
public class GetLaboratoryDetailResponse extends AuditableResponse {

    private static final long serialVersionUID = -4930950282581442189L;
    private String laboratoryId;
    private String laboratoryName;
    private String description;
    private MemberInfoResponse memberInfo;
    private Integer members;
    private List<GetProjectResponse> projects;
    private String major;
    private MemberInfoResponse ownerBy;
}
