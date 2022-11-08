package patterns.structural.facade;

public interface ProductAvailabilityService {
  boolean isAvailable(Long productId);
}