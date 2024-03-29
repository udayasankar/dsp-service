package com.dsp.controller;


import com.dsp.handler.DspHandler;
import com.dsp.mapper.DspMapper;
import com.dsp.mapper.DspResponseMapper;
import com.dsp.model.DspRequest;
import com.dsp.model.DspResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dsp/v1")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CampaignController {

    private final DspMapper dspMapper;
    private final DspResponseMapper dspResponseMapper;
    private final DspHandler dspHandler;

    @GetMapping("/{campaignId}")
    public DspResponse getDspByCampaignId(@PathVariable String campaignId) {
        return dspResponseMapper.map(dspHandler.getDspInfo(campaignId));
    }

    @PostMapping
    public DspResponse addDspCampaign(@RequestBody DspRequest dspRequest) {
        return dspResponseMapper.map(dspHandler.activateDspSegment(dspMapper.map(dspRequest)));
    }

    /*@PutMapping("/update")
    public BookDto updateBook(@RequestBody BookDto bookDto) {
        return bookServicePort.updateBook(bookDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBookByID(@PathVariable long id) {
        bookServicePort.deleteBookById(id);
    }*/
}
