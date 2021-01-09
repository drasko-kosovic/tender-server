package com.tender.controllers;

import com.tender.models.Ponude;
import com.tender.repository.PonudeRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = ("*"))
@RestController
@RequestMapping("/report")
public class PdfControler {

    @Autowired
    ApplicationContext context;

    @Autowired
    PonudeRepository ponudeRepository;

    @GetMapping(path = "/ponude/{broj_tendera}")
    @ResponseBody

    public void getPdfPonude(HttpServletResponse response, @PathVariable Integer broj_tendera) throws Exception {

        Resource resource = context.getResource("classpath:reports/ponude/Cherry_Landscape.jrxml");

        InputStream inputStream = resource.getInputStream();
        JasperReport report = JasperCompileManager.compileReport(inputStream);

        Map<String, Object> params = new HashMap<>();

        List<Ponude> ponude = (List<Ponude>) ponudeRepository.findByBroj_tendera(broj_tendera);


        JRDataSource dataSource = new JRBeanCollectionDataSource(ponude);
        params.put("datasource", dataSource);


        JasperPrint jasperPrint = JasperFillManager.fillReport(report, params, dataSource);

        response.setContentType(MediaType.APPLICATION_PDF_VALUE);

        JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());
    }

































}
