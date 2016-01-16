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

import app.model.RealestateInsPackage;
import app.repository.local.RealestatePackLocalRepository;

@RestController
@RequestMapping("/realestate")
public class RealestatePackController {
	@Autowired
	private RealestatePackLocalRepository realestateRepository;

	@RequestMapping(method = RequestMethod.POST)
	public Map<String, Object> createRealestatePackage(@RequestBody RealestateInsPackage realestate) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();

		if (realestate != null) {
			realestateRepository.save(realestate);
			response.put("message", "Package created successfully");
			response.put("package", realestate);
		} else {
			response.put("message", "Package is null");

		}
		return response;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<RealestateInsPackage> getRealestatePackage() {
		return (List<RealestateInsPackage>) realestateRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{packageId}")
	public RealestateInsPackage getPackageById(@PathVariable("packageId") String packageId) {
		return realestateRepository.findOne(packageId);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{packageId}")
	public String removePackage(@PathVariable("packageId") String packageId) {
		realestateRepository.delete(packageId);
		return "removed";
	}

}
