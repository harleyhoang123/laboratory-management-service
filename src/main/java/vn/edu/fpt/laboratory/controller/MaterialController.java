package vn.edu.fpt.laboratory.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.edu.fpt.laboratory.dto.common.GeneralResponse;
import vn.edu.fpt.laboratory.dto.common.PageableResponse;
import vn.edu.fpt.laboratory.dto.request.material.*;
import vn.edu.fpt.laboratory.dto.response.material.GetMaterialDetailResponse;
import vn.edu.fpt.laboratory.dto.response.material.GetMaterialResponse;
import vn.edu.fpt.laboratory.dto.response.material.OrderMaterialResponse;

/**
 * @author : Hoang Lam
 * @product : Charity Management System
 * @project : Charity System
 * @created : 29/11/2022 - 22:17
 * @contact : 0834481768 - hoang.harley.work@gmail.com
 **/
@RequestMapping("${app.application-context}/public/api/v1/materials")
public interface MaterialController {



    @DeleteMapping("/{material-id}/{image-id}")
    ResponseEntity<GeneralResponse<Object>> removeImage(@PathVariable(name = "material-id") String materialId, @PathVariable(name = "image-id") String imageId);

    @PostMapping("/{material-id}")
    ResponseEntity<GeneralResponse<Object>> addImage(@PathVariable(name = "material-id") String materialId, @RequestBody AddImageRequest request);

    @GetMapping
    ResponseEntity<GeneralResponse<PageableResponse<GetMaterialResponse>>> getMaterial();

    @GetMapping("/{material-id}")
    ResponseEntity<GeneralResponse<GetMaterialDetailResponse>> getMaterialId(@PathVariable(name = "material-id") String materialId);

    @PostMapping("/{laboratory-id}/{material-id}/order")
    ResponseEntity<GeneralResponse<OrderMaterialResponse>> orderMaterial(@PathVariable(name = "laboratory-id") String laboratoryId,
                                                                         @PathVariable(name = "material-id") String materialId,
                                                                         @RequestBody OrderMaterialRequest request);

    @PostMapping("/orders/{order-id}")
    ResponseEntity<GeneralResponse<Object>> returnMaterial(@PathVariable(name = "order-id") String orderId);
}
