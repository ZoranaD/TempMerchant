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

import app.model.VehicleInsPackage;
import app.repository.local.VehicleInsPackLocalRepository;

@RestController
@RequestMapping("/vehiclePackage")
public class VehicleInsPackController {

	@Autowired
	private VehicleInsPackLocalRepository vehiclePackRepository;

	@RequestMapping(method = RequestMethod.POST)
	public Map<String, Object> createVehiclePackage(@RequestBody VehicleInsPackage vehiclePackage) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		if (vehiclePackage != null) {
			vehiclePackRepository.save(vehiclePackage);
			response.put("message", "Package created successfully");
			response.put("package", vehiclePackage);
		} else {
			response.put("message", "Package is null");
		}
		return response;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<VehicleInsPackage> getAll() {
		return (List<VehicleInsPackage>) vehiclePackRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{packageId}")
	public VehicleInsPackage getPackageById(@PathVariable("packageId") String packageId) {
		return vehiclePackRepository.findOne(packageId);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{packageId}")
	public String removePackage(@PathVariable("packageId") String packageId) {
		vehiclePackRepository.delete(packageId);
		return "removed";
	}

}
