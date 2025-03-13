package com.ihsandedec.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihsandedec.dto.DtoHome;
import com.ihsandedec.dto.DtoRoom;
import com.ihsandedec.entites.Home;
import com.ihsandedec.entites.Room;
import com.ihsandedec.repository.IHomeRepository;
import com.ihsandedec.services.IHomeService;

@Service
public class HomeServiceImpl implements IHomeService {

	@Autowired
	private IHomeRepository homeRepository;

	@Override
	public DtoHome findHomeById(Long id) {
		DtoHome dtoHome = new DtoHome();

		Optional<Home> optional = homeRepository.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		Home dbHome = optional.get();
		BeanUtils.copyProperties(dbHome, dtoHome);

		List<Room> dbRooms = optional.get().getRoom();

		if (dbRooms != null && !dbRooms.isEmpty()) {
			for (Room room : dbRooms) {
				DtoRoom dtoRoom = new DtoRoom();
				BeanUtils.copyProperties(room, dtoRoom);
				dtoHome.getRoom().add(dtoRoom);
			}
		}

		return dtoHome;
	}
}
