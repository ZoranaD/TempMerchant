package app.controllers;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.model.Region;
import app.repository.local.RegionLocalRepository;

@RestController
@RequestMapping("/region")
public class RegionController {
	
	@Autowired
	private RegionLocalRepository regionRepository;

	@RequestMapping(method = RequestMethod.POST)
	public Map<String, Object> createRegion(@RequestBody Region region) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();

		if (region != null) {
			regionRepository.save(region);
			response.put("message", "Region created successfully");
			response.put("region", region);
		} else {
			response.put("message", "Region is null");

		}
		return response;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Region> getRegions() {
		return (List<Region>) regionRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{regionId}")
	public Region getRegionById(@PathVariable("regionId") String regionId) {
		return regionRepository.findOne(regionId);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{regionId}")
	public String removeRegion(@PathVariable("regionId") String regionId) {
		regionRepository.delete(regionId);
		return "removed";
	}
	
}
