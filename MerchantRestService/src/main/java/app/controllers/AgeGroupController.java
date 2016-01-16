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

import app.model.AgeGroup;
import app.repository.local.AgeGroupLocalRepository;

@RestController
@RequestMapping("/ageGroup")
public class AgeGroupController {

	@Autowired
	private AgeGroupLocalRepository ageGroupRepository;

	@RequestMapping(method = RequestMethod.POST)
	public Map<String, Object> createAgeGroup(@RequestBody AgeGroup group) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();

		if (group != null) {
			ageGroupRepository.save(group);
			response.put("message", "Group created successfully");
			response.put("group", group);
		} else {
			response.put("message", "Group is null");
		}
		return response;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<AgeGroup> getGroups() {
		return (List<AgeGroup>) ageGroupRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{groupId}")
	public AgeGroup getGroupById(@PathVariable("groupId") String groupId) {
		return ageGroupRepository.findOne(groupId);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{groupId}")
	public String removeGroup(@PathVariable("groupId") String groupId) {
		ageGroupRepository.delete(groupId);
		return "removed";
	}

}
