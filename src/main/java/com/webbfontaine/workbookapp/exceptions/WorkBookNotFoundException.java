package com.webbfontaine.workbookapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such Work Book")
public class WorkBookNotFoundException extends Exception {
}
