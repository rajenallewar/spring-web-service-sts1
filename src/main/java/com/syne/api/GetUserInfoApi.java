package com.syne.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.syne.api.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-05T07:52:19.544+05:30")

@Api(value = "getUserInfo", description = "the getUserInfo API")
public interface GetUserInfoApi {
 
    @ApiOperation(value = "get UserInfo by ID", nickname = "getUserInfo", notes = "Returns a single User", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid User ID supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/getUserInfo/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    User getUserInfo(@ApiParam(value = "ID of User to return",required=true) @PathVariable("userId") String UserId);
 
}
