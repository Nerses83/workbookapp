package com.webbfontaine.workbookapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such Work Place")
public class WorkPlaceNotFoundException extends Exception {
}
