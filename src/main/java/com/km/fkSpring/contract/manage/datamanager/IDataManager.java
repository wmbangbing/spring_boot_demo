package com.km.fkSpring.contract.manage.datamanager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.List;

public interface IDataManager {
    OutputStream build(HttpServletRequest request, HttpServletResponse response);

    OutputStream outputs(HttpServletRequest request, HttpServletResponse response, List<String> values);
}
