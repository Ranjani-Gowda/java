package com.xworkz.bikeshowroom.service;

import com.xworkz.bikeshowroom.dao.BikeDAO;
import com.xworkz.bikeshowroom.dto.BikeDTO;

public class BikeServiceImpl implements BikeService {

	private BikeDAO dao;

	public BikeServiceImpl(BikeDAO dao) {
		System.out.println("Generated - " + this.getClass().getSimpleName());
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(BikeDTO bikeDTO) {

		if (bikeDTO != null) {
			if (bikeDTO.getName() != null || bikeDTO.getName().isEmpty() || bikeDTO.getName().length() > 3) {
				System.out.println(bikeDTO.getName());
				System.out.println("Name is not standard cannot validate");

				if (bikeDTO.getLocation() == null || bikeDTO.getLocation().isEmpty()
						|| bikeDTO.getLocation().length() < 5) {
					System.out.println(bikeDTO.getLocation());
					System.out.println("Location is not valid");
					// return false;

					if (bikeDTO.getGstNo() > 0) {
						System.out.println(bikeDTO.getGstNo());
						System.out.println("GST is not valid");
						// return false;

						if (bikeDTO.getPhno() > 0) {
							System.out.println(bikeDTO.getPhno());
							System.out.println("Phone number is not valid");
							// return false;

							if (bikeDTO.getScooterDTO() != null) {
								System.out.println("Scooter is null");
								// return false;

								if (bikeDTO.getScooterDTO().getColor() != null
										|| bikeDTO.getScooterDTO().getColor().isEmpty()) {
									System.out.println("Scooter Color is not valid");
									System.out.println(bikeDTO.getScooterDTO().getColor());
									// return false;

									if (bikeDTO.getScooterDTO().getCc() != 0
											|| bikeDTO.getScooterDTO().getCc() > 5000) {
										System.out.println("Scooter CC is not valid");
										// return false;

										if (bikeDTO.getScooterDTO().getPrice() != 0
												|| bikeDTO.getScooterDTO().getPrice() > 800000) {
											System.out.println("Scooter Price is not valid");
											// return false;

											if (bikeDTO.getScooterDTO().getCompany() != null
													|| bikeDTO.getScooterDTO().getCompany().isEmpty()) {
												System.out.println("Scooter Company is not valid");
												// return false;

												if (bikeDTO.getScooterDTO().getSportsBikeDTO().getMileage() != null
														|| bikeDTO.getScooterDTO().getSportsBikeDTO().getMileage()
																.isEmpty()) {
													System.out.println("Sports Bike Mileage is not valid");
													// return false;

													if (bikeDTO.getScooterDTO().getSportsBikeDTO().getCc() != null
															|| bikeDTO.getScooterDTO().getSportsBikeDTO().getCc()
																	.isEmpty()) {
														System.out.println("Sports Bike CC is not valid");
														// return false;

														if (bikeDTO.getScooterDTO().getSportsBikeDTO().getPrice() != 0
																|| bikeDTO.getScooterDTO().getSportsBikeDTO()
																		.getPrice() > 1000000) {
															System.out.println("Sports Bike Price is not valid");
															// return false;

															if (bikeDTO.getScooterDTO().getSportsBikeDTO()
																	.getWeight() != null
																	|| bikeDTO.getScooterDTO().getSportsBikeDTO()
																			.getWeight().isEmpty()) {
																System.out.println("Sports Bike Weight is not valid");
																// return false;

																if (bikeDTO.getScooterDTO().getSportsBikeDTO()
																		.getCompany() != null
																		|| bikeDTO.getScooterDTO().getSportsBikeDTO()
																				.getCompany().isEmpty()) {
																	System.out.println(
																			"Sports Bike Company is not valid");
																	return false;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}

		} else {
			System.out.println("Bike is null cannot validate");
			return false;
		}

		return false;
	}
}