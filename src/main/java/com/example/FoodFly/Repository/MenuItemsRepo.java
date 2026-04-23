package com.example.FoodFly.Repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;

import com.example.FoodFly.enitity.MenuItems;

public interface MenuItemsRepo extends JpaRepository<MenuItems, Long> {

//	List<MenuItems> getByIdAndisApproved();

//	List<MenuItems> findByIsApprovedTrue();

	Page<MenuItems> findByIsApprovedTrue(Pageable pg);

	




	List<MenuItems> findByCuisinetype_CusineTypeid(Integer id);




	@Query("select m from MenuItems m where " +
		       "lower(m.item_name) like lower(concat('%', :q, '%')) " +
		       "or lower(m.restaurantName) like lower(concat('%', :q, '%'))")
		List<MenuItems> searchbyitemorrestaurant(@Param("q") String q);

}
