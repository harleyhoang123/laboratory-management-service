package vn.edu.fpt.laboratory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.edu.fpt.laboratory.entity.OrderHistory;

import java.util.List;

/**
 * @author : Hoang Lam
 * @product : Charity Management System
 * @project : Charity System
 * @created : 30/11/2022 - 22:56
 * @contact : 0834481768 - hoang.harley.work@gmail.com
 **/
@Repository
public interface OrderHistoryRepository extends MongoRepository<OrderHistory, String> {
    List<OrderHistory> getOrderHistoriesByMaterialIdAndStatus(String materialId, String status);

    List<OrderHistory> findByMaterialIdAndStatus(String materialId, String status);
}
