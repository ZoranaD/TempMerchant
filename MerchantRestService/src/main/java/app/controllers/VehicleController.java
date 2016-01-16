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

import app.model.Vehicle;
import app.repository.local.VehicleLocalRepository;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private VehicleLocalRepository vehicleRepository;

	@RequestMapping(method = RequestMethod.POST)
	public Map<String, Object> createVehicle(@RequestBody Vehicle vehicle) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();

		if (vehicle != null) {
			vehicleRepository.save(vehicle);
			response.put("message", "Vehicle created successfully");
			response.put("sport", vehicle);
		} else {
			response.put("message", "Vehicle is null");

		}
		return response;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Vehicle> getAll() {
		return (List<Vehicle>) vehicleRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{vehicleId}")
	public Vehicle getVehicleById(@PathVariable("vehicleId") String vehicleId) {
		return vehicleRepository.findOne(vehicleId);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{vehicleId}")
	public String removeVehicle(@PathVariable("vehicleId") String vehicleId) {
		vehicleRepository.delete(vehicleId);
		return "removed";
	}

}
