package com.pendataan.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pendataan.commonServices.CommonStatus;
import com.pendataan.dao.PendudukDao;
import com.pendataan.dto.PendudukDto;
import com.pendataan.model.Penduduk;
import com.pendataan.responseUtil.ResponseUtil;

@Controller
@RequestMapping("/rest/penduduk")
public class PendudukRest {

	@Autowired
	private PendudukDao pendudukDao;

	@PostMapping("/insert")
	public ResponseEntity insertOrUpdatePenduduk(@RequestBody PendudukDto dataPenduduk) {

		if (dataPenduduk == null)
			return new ResponseEntity("Failed", HttpStatus.GONE);
		//  return ResponseUtil.response(1, "Failed");
		Penduduk penduduk = pendudukDao.findOne(dataPenduduk.getId_penduduk());

		if (penduduk == null) {

			Penduduk pend = new Penduduk();
			pend.setNama_lengkap(dataPenduduk.getNama_lengkap());
			pend.setTempat_lahir(dataPenduduk.getTempat_lahir());
			pend.setAlamat(dataPenduduk.getAlamat());
			pend.setPekerjaan(dataPenduduk.getPekerjaan());
			pend.setNomor_telepon(dataPenduduk.getNomor_telepon());
			pend.setTanggal_registrasi(dataPenduduk.getTanggal_registrasi());
			pend.setJenis_kelamin(dataPenduduk.getJenis_kelamin());
			pend.setGolongan_darah(dataPenduduk.getGolongan_darah());
			pend.setPendidikan_terakhir(dataPenduduk.getPendidikan_terakhir());
			pend.setStatus_pendidikan(dataPenduduk.getStatus_pendidikan());
			pend.setStatus_perkawinan(dataPenduduk.getStatus_perkawinan());
			pend.setKewarganegaraan(dataPenduduk.getKewarganegaraan());
			pend.setStatus_ekonomi(CommonStatus.getStatusEkonomi(penghasilan));
			pend.setJumlah_penghasilan(dataPenduduk.getJumlah_penghasilan(penghasilan));
			pendudukDao.save(pend);
		} else {
			penduduk.setNama_lengkap(dataPenduduk.getNama_lengkap());
			penduduk.setTempat_lahir(dataPenduduk.getTempat_lahir());
			penduduk.setAlamat(dataPenduduk.getAlamat());
			penduduk.setPekerjaan(dataPenduduk.getPekerjaan());
			penduduk.setNomor_telepon(dataPenduduk.getNomor_telepon());
			penduduk.setTanggal_registrasi(dataPenduduk.getTanggal_registrasi());
			penduduk.setJenis_kelamin(dataPenduduk.getJenis_kelamin());
			penduduk.setGolongan_darah(dataPenduduk.getGolongan_darah());
			penduduk.setPendidikan_terakhir(dataPenduduk.getPendidikan_terakhir());
			penduduk.setStatus_pendidikan(dataPenduduk.getStatus_pendidikan());
			penduduk.setStatus_perkawinan(dataPenduduk.getStatus_perkawinan());
			penduduk.setKewarganegaraan(dataPenduduk.getKewarganegaraan());
			penduduk.setStatus_ekonomi(CommonStatus.getStatusEkonomi(penghasilan));
			penduduk.setJumlah_penghasilan(dataPenduduk.getJumlah_penghasilan(penghasilan));
			pendudukDao.save(penduduk);
		}
		return new ResponseEntity("Success", HttpStatus.OK);
		// return ResponseUtil.response(1, "Success");
	}

	@PostMapping("/delete")
	public ResponseUtil deletePenduduk(@RequestBody Integer id_penduduk) {

		Penduduk pen = pendudukDao.findOne(id_penduduk);

		if (pen != null) {
			pendudukDao.delete(pen);
		} else
			return new ResponseUtil();
		
		return new ResponseUtil();
	}
	
}
