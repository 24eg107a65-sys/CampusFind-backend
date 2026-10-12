
package com.lostfound.lostfound.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lostfound.lostfound.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
