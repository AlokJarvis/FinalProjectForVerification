package com.capg.dao;

import com.capg.service.ITrackServiceInterface;

public interface ITrackDetailsInterface extends ITrackServiceInterface
{
	public String getTrackOrderDetails(Integer id);

}
